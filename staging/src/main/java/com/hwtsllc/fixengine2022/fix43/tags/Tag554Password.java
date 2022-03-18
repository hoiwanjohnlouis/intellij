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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag554Password extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public Tag554Password(String dataValue) {
        setFixType(FIXType.FIX554_PASSWORD);
        setDataValue(dataValue);
    }

    public static void main(String[] args) {
        Tag554Password tag554Password = new Tag554Password("tag554 Password");
        System.out.println("t1.1:" + tag554Password);
        System.out.println("t1.2:" + tag554Password.toLogStringVerbose());
        System.out.println("t1.3.FIXTypeName:" + tag554Password.getEnumName());
        System.out.println("t1.4.FIXNumber:" + tag554Password.getID());
        System.out.println("t1.5.FIXName:" + tag554Password.getName());
        System.out.println("t1.6.FIXDescription:" + tag554Password.getDescription());
        System.out.println("t1.7.DataValue:" + tag554Password.getDataValue());
        System.out.println("t1.8.FixString:" + tag554Password.toFixTagValuePairString());
    }
}
