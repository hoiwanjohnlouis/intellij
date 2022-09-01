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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1109TriggerPriceDirection;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1109
 *  TriggerPriceDirection
 *  char
 *  <p>
 *  The side from which the trigger price is reached.
 *  <p></p>
 *  Valid values:
 *  <p>    U - Trigger if the price of the specified type goes UP to or through the specified Trigger Price
 *  <p>    D - Trigger if the price of the specified type goes DOWN to or through the specified Trigger Price
 */
public class Tag1109EnuTriggerPriceDirection extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1109TriggerPriceDirection dataValue;

    public final static Enum1109TriggerPriceDirection TESTA_ENU_TRIGGER_PRICE_DIRECTION
            = Enum1109TriggerPriceDirection.TRIGGER_DOWN;
    public final static Enum1109TriggerPriceDirection TESTB_ENU_TRIGGER_PRICE_DIRECTION
            = Enum1109TriggerPriceDirection.TRIGGER_UP;

    public Tag1109EnuTriggerPriceDirection(Enum1109TriggerPriceDirection dataValue) {
        setFixType(FIX50.FIX1109_ENU_TRIGGER_PRICE_DIRECTION);
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
        return dataValue.toEnumDescriptionString();
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
        Tag1109EnuTriggerPriceDirection tagData;

        tagData = new Tag1109EnuTriggerPriceDirection(TESTA_ENU_TRIGGER_PRICE_DIRECTION);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1109EnuTriggerPriceDirection(TESTB_ENU_TRIGGER_PRICE_DIRECTION);
        System.out.println(tagData.toVerboseString());
    }
}
