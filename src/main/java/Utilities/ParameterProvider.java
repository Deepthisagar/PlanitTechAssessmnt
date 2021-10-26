package Utilities;


import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ParameterProvider {

    public enum ParameterName {
        URL

    }

    public enum AppName {
        JupiterToys
    }


    private static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    public static String getParameter(ParameterName parameterName, AppName appName) {
        switch (appName) {

            case JupiterToys:
                if (parameterName == ParameterName.URL) {
                    return variables.getProperty("jupitertoys.url");
                } else {
                    Assert.fail("Unknown Parameter requested :" + parameterName);
                }
                break;




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
