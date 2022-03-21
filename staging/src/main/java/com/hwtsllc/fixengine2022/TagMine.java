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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class TagMine extends FIXTypeWrapper implements  FixTagValuePairString, LogStringVerbose {
    private DataType dataValue;

    public TagMine(DataType dataValue) {
        setFixType(FIXType.FIX58_TEXT);
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
    }
    public void setDataValue(final int dataValue)  {
        this.dataValue.setDataValue(dataValue);
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getAction()
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
        TagMine tagMine = new TagMine(new DataType(3123) );
        System.out.println("t1.1:"+tagMine);
        System.out.println("t1.2:"+tagMine.toLogStringVerbose());
        System.out.println("t1.7.DataValue:"+tagMine.getDataValue());
        System.out.println("t1.8.FixString:"+tagMine.toFixTagValuePairString());
        System.out.println("after updating dataValue");
        tagMine.setDataValue(987654321);
        System.out.println(tagMine.toLogStringVerbose());
        System.out.println(tagMine.getDataValue());
        System.out.println(tagMine.toFixTagValuePairString());
    }
}
