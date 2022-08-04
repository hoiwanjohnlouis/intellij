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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  557
 *  TotNoSecurityTypes
 *  int
 *  <p></p>
 *  Indicates total number of security types in the event that multiple Security Type messages are used to return results
 *  <p></p>
 *  (Prior to FIX 4.4 this field was named TotalNumSecurityTypes)
 */
public class Tag557IntTotNoSecurityTypes extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_TOT_NO_SECURITY_TYPES
            = 557;
    public final static int TESTB_INT_TOT_NO_SECURITY_TYPES
            = 755;

    public Tag557IntTotNoSecurityTypes(MyIntType dataValue) {
        setFixType(FIX43.FIX557_INT_TOT_NO_SECURITY_TYPES);
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
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
        Tag557IntTotNoSecurityTypes tagData;

        tagData = new Tag557IntTotNoSecurityTypes(new MyIntType(TESTA_INT_TOT_NO_SECURITY_TYPES) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag557IntTotNoSecurityTypes(new MyIntType(TESTB_INT_TOT_NO_SECURITY_TYPES) );
        System.out.println(tagData.toVerboseString());
    }
}
