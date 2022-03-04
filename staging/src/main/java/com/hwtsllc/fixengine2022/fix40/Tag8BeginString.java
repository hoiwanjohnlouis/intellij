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

public class Tag8BeginString extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public final static String BEGIN_STRING_4_0 = "FIX.4.0";
    public final static String BEGIN_STRING_4_2 = "FIX.4.2";
    public final static String BEGIN_STRING_4_3 = "FIX.4.3";
    public final static String BEGIN_STRING_4_4 = "FIX.4.4";
    public final static String BEGIN_STRING_5_0 = "FIXT.1.1";

    public final static String BEGIN_STRING_CURRENT = BEGIN_STRING_4_4;

    public Tag8BeginString(String dataValue) {
        setFixType(FIXType.FIX8_BEGIN_STRING);
        setDataValue(dataValue);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Tag8BeginString tag8BeginString = new Tag8BeginString(Tag8BeginString.BEGIN_STRING_CURRENT);
        System.out.println(tag8BeginString);
        System.out.println(tag8BeginString.toLogStringVerbose());
        System.out.println(tag8BeginString.toFixTagValuePairString());
    }
}
