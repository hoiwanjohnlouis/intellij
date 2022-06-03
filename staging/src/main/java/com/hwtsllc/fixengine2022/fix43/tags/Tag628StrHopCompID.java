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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  628
 *  HopCompID
 *  String
 *  <p>
 *  Assigned value used to identify the third party firm which delivered a specific message
 *  either from the firm which originated the message or from another third party
 *  (if multiple "hops" are performed).
 *  <p>
 *  It is recommended that this value be the SenderCompID (49) of the third party.
 *  <p>
 *  Applicable when messages are communicated/re-distributed via third parties
 *  which function as service bureaus or "hubs".
 *  <p>
 *  Only applicable if OnBehalfOfCompID (115) is being used.
 */
public class Tag628StrHopCompID extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_HOP_COMP_ID = "BilboBaggins-Tag628StrHopCompID";
    public final static String TESTB_STR_HOP_COMP_ID = "Gandalf-Tag628StrHopCompID";

    public Tag628StrHopCompID(MyStringType dataValue) {
        setFixType(FIX43.FIX628_STR_HOP_COMP_ID);
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
        Tag628StrHopCompID tagData;

        tagData = new Tag628StrHopCompID(new MyStringType(TESTA_STR_HOP_COMP_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag628StrHopCompID(new MyStringType(TESTB_STR_HOP_COMP_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
