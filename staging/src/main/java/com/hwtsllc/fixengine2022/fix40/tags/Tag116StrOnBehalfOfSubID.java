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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  116
 *  OnBehalfOfSubID
 *  String
 *  Assigned value used to identify specific message originator
 *  (i.e. trader) if the message was delivered by a third party
 */
public class Tag116StrOnBehalfOfSubID extends FIX40Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_ON_BEHALF_OF_SUB_ID = "BilboBaggins-116OnBehalfOfSubID"; // fake data
    public final static String TESTB_STR_ON_BEHALF_OF_SUB_ID = "Gandalf-116OnBehalfOfSubID";

    public Tag116StrOnBehalfOfSubID(MyStringType dataValue) {
        setFixType(FIX40.FIX116_STR_ON_BEHALF_OF_SUB_ID);
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
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag116StrOnBehalfOfSubID(new MyStringType(TESTA_STR_ON_BEHALF_OF_SUB_ID)).toVerboseString() );
        System.out.println( new Tag116StrOnBehalfOfSubID(new MyStringType(TESTB_STR_ON_BEHALF_OF_SUB_ID)).toVerboseString() );
    }
}
