package net.adisan.service.specificservice_4;

import com.google.gson.Gson;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import net.adisan.bean.ResponseBean;
import net.adisan.connection.ConnectionInterface;
import net.adisan.exceptions.MyException;
import net.adisan.factory.GsonFactory;
import net.adisan.helper.Log4jHelper;
import net.adisan.service.genericservice.GenericService;
import net.adisan.service.serviceinterface.ServiceInterface;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class CatalogoImagenesService_3 extends GenericService implements ServiceInterface {

    Connection oConnection = null;
    ResponseBean oResponseBean = null;
    Gson oGson = GsonFactory.getGson();
    ConnectionInterface oConnectionImplementation = null;
    HttpSession oSession = oRequest.getSession();

    public CatalogoImagenesService_3(HttpServletRequest oRequest) {
        super(oRequest);
        ob = oRequest.getParameter("ob");
    }

    public String addimage() throws Exception {
        ResponseBean oResponseBean = null;
        String name = "";
        HashMap<String, String> hash = new HashMap<>();
        if (ServletFileUpload.isMultipartContent(oRequest)) {
            try {
                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(oRequest);
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        name = new File(item.getName()).getName();
                        item.write(new File(".//..//webapps//imagenes//" + name));
                    } else {
                        hash.put(item.getFieldName(), item.getString());
                    }
                }
                oResponseBean = new ResponseBean(200, "Imagen subida con exito");
            } catch (MyException ex) {
                String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
                Log4jHelper.errorLog(msg, ex);
                ex.addDescripcion(msg);
                throw ex;
            }
        }
        Gson oGson = new Gson();
        return oGson.toJson(oResponseBean);
    }

}
