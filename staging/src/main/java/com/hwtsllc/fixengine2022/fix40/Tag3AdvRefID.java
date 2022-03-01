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

public class Tag3AdvRefID extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public Tag3AdvRefID(String dataValue) {
        setFixType(FIXType.FIX3_ADV_REF_ID);
        setDataValue(dataValue);
    }

    public static void main(String[] args) {
        Tag3AdvRefID tag3AdvRefID = new Tag3AdvRefID("tag3 Adv Ref ID");
        System.out.println("t1.1:" + tag3AdvRefID);
        System.out.println("t1.2:" + tag3AdvRefID.toLogStringVerbose());
        System.out.println("t1.3.FIXTypeName:" + tag3AdvRefID.getFIXTypeName());
        System.out.println("t1.4.FIXNumber:" + tag3AdvRefID.getFIXNumber());
        System.out.println("t1.5.FIXName:" + tag3AdvRefID.getFIXName());
        System.out.println("t1.6.FIXDescription:" + tag3AdvRefID.getFIXDescription());
        System.out.println("t1.7.DataValue:" + tag3AdvRefID.getDataValue());
        System.out.println("t1.8.FixString:" + tag3AdvRefID.toFixTagValuePairString());
    }
}
