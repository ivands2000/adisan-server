package net.adisan.helper;

import net.adisan.setting.ConfigurationSettings;
import net.adisan.setting.ConfigurationSettings.EnvironmentConstans;

public class TraceHelper {

    public static void trace(String s) {
        if (ConfigurationSettings.environment == EnvironmentConstans.Debug) {
            System.out.println(s);
        }
    }
}
