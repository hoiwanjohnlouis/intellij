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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  145
 *  DeliverToLocationID
 *  String
 *  <p>
 *  Assigned value used to identify specific message recipient’s location (i.e. geographic location and/or desk, trader) if the message was delivered by a third party
 */
public class Tag145StrDeliverToLocationID extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_DELIVER_TO_LOCATION_ID = "BilboBaggins-145StrDeliverToLocationID";
    public final static String TESTB_STR_DELIVER_TO_LOCATION_ID = "Gandalf-145StrDeliverToLocationID";

    public Tag145StrDeliverToLocationID(MyStringType dataValue) {
        setFixType(FIX41.FIX145_STR_DELIVER_TO_LOCATION_ID);
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
        Tag145StrDeliverToLocationID tagData;

        tagData = new Tag145StrDeliverToLocationID(new MyStringType(TESTA_STR_DELIVER_TO_LOCATION_ID) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag145StrDeliverToLocationID(new MyStringType(TESTB_STR_DELIVER_TO_LOCATION_ID) );
        System.out.println( tagData.toVerboseString() );
    }
}
