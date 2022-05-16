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

package com.hwtsllc.fixengine2022;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

public class LogDataType extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final DataSType dataValue;

    public LogDataType(DataSType dataValue) {
        setFixType(FIX27.FIX58_STR_TEXT);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    public void setDataValue(final String dataValue)  {
        this.dataValue.setDataValue(dataValue);
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        LogST tagData;

        tagData = new LogST(new DataSType("3123") );
        System.out.println("t1.1:"+ tagData);
        System.out.println("t1.2:"+ tagData.toVerboseString());
        System.out.println("t1.7.DataValue:"+ tagData.getDataValue());
        System.out.println("t1.8.FixString:"+ tagData.toValuePairString());
        System.out.println("after updating dataValue");

        tagData.setDataValue("987654321");
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.getDataValue());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
    }
}
