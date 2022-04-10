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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

@Deprecated
public class TagDataType extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private DataSType dataValue;

    public TagDataType(DataSType dataValue) {
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
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        TagST tagData;

        tagData = new TagST(new DataSType("3123") );
        System.out.println("t1.1:"+ tagData);
        System.out.println("t1.2:"+ tagData.toLogStringVerbose());
        System.out.println("t1.7.DataValue:"+ tagData.getDataValue());
        System.out.println("t1.8.FixString:"+ tagData.toFixTagValuePairString());
        System.out.println("after updating dataValue");

        tagData.setDataValue("987654321");
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.getDataValue());
        System.out.println(tagData.toFixTagValuePairString());
        System.out.println("Accessing FIXType");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
    }
}
