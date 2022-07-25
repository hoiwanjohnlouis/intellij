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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  24
 *  IOIOthSvc  (no longer used)
 *  char
 *  <p></p>
 *  Deprecated in FIX.4.1
 */
// @Deprecated
public class Tag24StrIOIOthSvc extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_IOI_OTH_SVC
            = "AvaGardner-Tag24StrIOIOthSvc";
    public final static String TESTB_STR_IOI_OTH_SVC
            = "AvaLavinaGardner-Tag24StrIOIOthSvc";

    public Tag24StrIOIOthSvc(MyStringType dataValue) {
        setFixType(FIX27.FIX24_STR_IOI_OTH_SVC);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
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
     * @param args      Not used.
     */
    public static void main(String[] args) {
        System.out.println( new Tag24StrIOIOthSvc(new MyStringType(TESTA_STR_IOI_OTH_SVC)).toVerboseString() );
        System.out.println( new Tag24StrIOIOthSvc(new MyStringType(TESTB_STR_IOI_OTH_SVC)).toVerboseString() );
    }
}
