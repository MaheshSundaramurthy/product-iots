/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.iot.integration.web.ui.test.common;

import org.openqa.selenium.WebDriver;
import org.wso2.carbon.automation.engine.context.AutomationContext;
import org.wso2.iot.integration.ui.pages.login.LoginPage;

import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

/**
 * This class is used to login to the server as the Admin.
 */
public class LoginUtils {

    /**
     * This method is used to login as admin.
     *
     * @param driver            The selenium web driver
     * @param automationContext Test Automation context
     * @param webAppURL         The server url
     */
    public static void login(WebDriver driver, AutomationContext automationContext,
                             String webAppURL) throws IOException, XPathExpressionException {
        driver.get(webAppURL + Constants.IOT_LOGIN_PATH);
        LoginPage test = new LoginPage(driver);
        test.loginAsAdmin(automationContext.getSuperTenant().getTenantAdmin().getUserName(),
                          automationContext.getSuperTenant().getTenantAdmin().getPassword());
    }
}
