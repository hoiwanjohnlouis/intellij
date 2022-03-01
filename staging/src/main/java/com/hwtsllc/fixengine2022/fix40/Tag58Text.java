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

public class Tag58Text extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public Tag58Text(String dataValue) {
        setFixType(FIXType.FIX58_TEXT);
        setDataValue(dataValue);
    }

    public static void main(String[] args) {
        Tag58Text tag58TExt = new Tag58Text("hello from main routine");
        System.out.println("t1.1:"+tag58TExt);
        System.out.println("t1.2:"+tag58TExt.toLogStringVerbose());
        System.out.println("t1.3.FIXTypeName:"+tag58TExt.getFIXTypeName());
        System.out.println("t1.4.FIXNumber:"+tag58TExt.getFIXNumber());
        System.out.println("t1.5.FIXName:"+tag58TExt.getFIXName());
        System.out.println("t1.6.FIXDescription:"+tag58TExt.getFIXDescription());
        System.out.println("t1.7.DataValue:"+tag58TExt.getDataValue());
        System.out.println("t1.8.FixString:"+tag58TExt.toFixTagValuePairString());
    }
}
