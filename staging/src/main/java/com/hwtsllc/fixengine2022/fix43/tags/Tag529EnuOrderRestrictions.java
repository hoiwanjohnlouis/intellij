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
import com.hwtsllc.fixengine2022.fix43.enums.Enum529OrderRestrictions;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  529
 *  OrderRestrictions
 *  MultipleCharValue
 *  <p></p>
 *  Restrictions associated with an order.
 *  <p>
 *  If more than one restriction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Program Trade
 *  <p>    2 - Index Arbitrage
 *  <p>    3 - Non-Index Arbitrage
 *  <p>    4 - Competing Market Maker
 *  <p>    5 - Acting as Market Maker or Specialist in the security
 *  <p></p>
 *  <p>    6 - Acting as Market Maker of Specialist in the
 *              underlying security of a derivative security
 *  <p>    7 - Foreign Entity (of foreign government or regulatory jurisdiction)
 *  <p>    8 - External Market Participant
 *  <p>    9 - External Inter-connected Market Linkage
 *  <p>    A - Riskless Arbitrage
 */
public class Tag529EnuOrderRestrictions extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum529OrderRestrictions dataValue;

    public final static Enum529OrderRestrictions TESTA_ENU_ORDER_RESTRICTIONS
            = Enum529OrderRestrictions.EXTERNAL_INTER_CONNECTED;
    public final static Enum529OrderRestrictions TESTB_ENU_ORDER_RESTRICTIONS
            = Enum529OrderRestrictions.RISKLESS_ARBITRAGE;

    public Tag529EnuOrderRestrictions(Enum529OrderRestrictions dataValue) {
        setFixType(FIX43.FIX529_ENU_ORDER_RESTRICTIONS);
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
        Tag529EnuOrderRestrictions tagData;

        tagData = new Tag529EnuOrderRestrictions(TESTA_ENU_ORDER_RESTRICTIONS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag529EnuOrderRestrictions(TESTB_ENU_ORDER_RESTRICTIONS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            System.out.println( new Tag529EnuOrderRestrictions(oneEnum).toVerboseString() );
        }
    }
}
