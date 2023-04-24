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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.tags.fix50.enums.Enum1107TriggerPriceType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1107
 *  TriggerPriceType
 *  char
 *  <p>
 *  The type of price that the trigger is compared to.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Best Offer
 *  <p>    2 - Last Trade
 *  <p>    3 - Best Bid
 *  <p>    4 - Best Bid or Last Trade
 *  <p>    5 - Best Offer or Last Trade
 *  <p></p>
 *  <p>    6 - Best Mid
 */
public class Tag1107EnuTriggerPriceType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1107TriggerPriceType dataValue;

    public final static Enum1107TriggerPriceType TESTA_ENU_TRIGGER_PRICE_TYPE
            = Enum1107TriggerPriceType.LAST_TRADE;
    public final static Enum1107TriggerPriceType TESTB_ENU_TRIGGER_PRICE_TYPE
            = Enum1107TriggerPriceType.BEST_MID;

    public Tag1107EnuTriggerPriceType(Enum1107TriggerPriceType dataValue) {
        setFixType(FIX50.FIX1107_ENU_TRIGGER_PRICE_TYPE);
        this.dataValue = dataValue;
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
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1107EnuTriggerPriceType tagData;

        tagData = new Tag1107EnuTriggerPriceType(TESTA_ENU_TRIGGER_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1107EnuTriggerPriceType(TESTB_ENU_TRIGGER_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
