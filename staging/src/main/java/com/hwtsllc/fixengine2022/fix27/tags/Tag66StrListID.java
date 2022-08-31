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
 *  66
 *  ListID
 *  String
 *  <p></p>
 *  Unique identifier for list as assigned by institution,
 *  used to associate multiple individual orders.
 *  <p></p>
 *  Uniqueness must be guaranteed within a single trading day.
 *  <p></p>
 *  Firms which generate multi-day orders should consider embedding
 *  a date within the ListID field to assure uniqueness across days.
 */
public class Tag66StrListID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_LIST_ID
            = "KimYooJung-Tag66StrListID";
    public final static String TESTB_STR_LIST_ID
            = "LeeEl-Tag66StrListID";

    public Tag66StrListID(MyStringType dataValue) {
        setFixType(FIX27.FIX66_STR_LIST_ID);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(this.dataValue.toString());
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag66StrListID(new MyStringType(TESTA_STR_LIST_ID)).toVerboseString() );
        System.out.println( new Tag66StrListID(new MyStringType(TESTB_STR_LIST_ID)).toVerboseString() );
    }
}