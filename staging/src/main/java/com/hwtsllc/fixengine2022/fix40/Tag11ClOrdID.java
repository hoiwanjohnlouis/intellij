/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix40;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag11ClOrdID extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public Tag11ClOrdID(String dataValue) {
        setFixType(FIXType.FIX11_CL_ORD_ID);
        setDataValue(dataValue);
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag11ClOrdID tag11ClOrdID = new Tag11ClOrdID("ORDER-1234");
        System.out.println(tag11ClOrdID);
        System.out.println(tag11ClOrdID.toLogStringVerbose());
        System.out.println(tag11ClOrdID.toFixTagValuePairString());
    }
}
