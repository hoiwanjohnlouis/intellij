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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1111TriggerOrderType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1111
 *  TriggerOrderType
 *  char
 *  <p>
 *  The OrdType the order should have after the trigger has hit.
 *  <p></p>
 *  Required to express orders that change from Limit to Market.
 *  <p></p>
 *  Other values from OrdType (40) may be used if appropriate and bilaterally agreed upon.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Market
 *  <p>    2 - Limit
 */
public class Tag1111EnuTriggerOrderType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1111TriggerOrderType dataValue;

    public final static Enum1111TriggerOrderType TESTA_ENU_TRIGGER_ORDER_TYPE
            = Enum1111TriggerOrderType.MARKET;
    public final static Enum1111TriggerOrderType TESTB_ENU_TRIGGER_ORDER_TYPE
            = Enum1111TriggerOrderType.LIMIT;

    public Tag1111EnuTriggerOrderType(Enum1111TriggerOrderType dataValue) {
        setFixType(FIX50.FIX1111_ENU_TRIGGER_ORDER_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(getDataValue());
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        Tag1111EnuTriggerOrderType tagData;

        tagData = new Tag1111EnuTriggerOrderType(TESTA_ENU_TRIGGER_ORDER_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1111EnuTriggerOrderType(TESTB_ENU_TRIGGER_ORDER_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
