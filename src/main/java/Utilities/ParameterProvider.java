package Utilities;


import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ParameterProvider {

    public enum ParameterName {
        URL,
        AUTHORIZATION
    }

    public enum AppName {
        MLCUI, TAXCALUI, AUPOST
    }


    private static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    public static String getParameter(ParameterName parameterName, AppName appName) {
        switch (appName) {
            case MLCUI:
                if (parameterName == ParameterName.URL) {
                    return variables.getProperty("MLCUI.url");
                } else {
                    Assert.fail("Unknown Parameter requested :" + parameterName);
                }
                break;
            case AUPOST:
                switch (parameterName) {
                    case URL:
                        return variables.getProperty("AUPOST.api_url");
                    case AUTHORIZATION:
                        return variables.getProperty("AUPOST.APIKey");
                    default:
                        Assert.fail("Unknown Parameter requested :" + parameterName);
                        break;
                }
            case TAXCALUI:
                if (parameterName == ParameterName.URL) {
                    return variables.getProperty("TAXCALUI.url");
                } else {
                    Assert.fail("Unknown Parameter requested :" + parameterName);
                }
//        switch (parameterName) {
//            case STORE_ID:
//                return variables.getProperty("store.id");
//            case STORE_ID_RCV:
//                return variables.getProperty("store.id_rcv");
//            case STORE_NAME:
//                return variables.getProperty("store.name");
//            case STORE_NAME_RCV:
//                return variables.getProperty("store.name_rcv");
//            case STORE_STATE:
//                return variables.getProperty("store.state");
//            case SERVER:
//                return variables.getProperty("store.server");
//            case TILLID:
//                return variables.getProperty("store.tillid");
//            case STORE_STATE_RCV:
//                return variables.getProperty("store.state_rcv");
//            case TYPE:
//                return variables.getProperty("store.type");
//            case CUTOFF_TIME:
//                return variables.getProperty("store.cutoff_time");
//
//            default:
//                Assert.fail("Unknown Parameter requested :" + parameterName);
//                break;
//        }
//        default:
//        Assert.fail("Unknown Application Name provided :" + appName);
//        break;
    }
                return null;
        }
    }
