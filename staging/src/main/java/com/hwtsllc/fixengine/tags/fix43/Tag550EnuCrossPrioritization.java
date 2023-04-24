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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.enums.fix43.Enum550CrossPrioritization;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  550
 *  CrossPrioritization
 *  int
 *  <p></p>
 *  Indicates if one side or the other of a cross order should be prioritized.
 *  <p></p>
 *  The definition of prioritization is left to the market.
 *  <p></p>
 *  In some markets, - prioritization means which side of the cross order is applied to the market first.
 *  <p></p>
 *  In other markets, - prioritization may mean that the prioritized side is fully executed
 *  (sometimes referred to as the side being protected).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None
 *  <p>    1 - Buy side is prioritized
 *  <p>    2 - Sell side is prioritized
 */
public class Tag550EnuCrossPrioritization extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum550CrossPrioritization dataValue;

    public final static Enum550CrossPrioritization TESTA_ENU_CROSS_PRIORITIZATION
            = Enum550CrossPrioritization.BUY_PRIORITY;
    public final static Enum550CrossPrioritization TESTB_ENU_CROSS_PRIORITIZATION
            = Enum550CrossPrioritization.SELL_PRIORITY;

    public Tag550EnuCrossPrioritization(Enum550CrossPrioritization dataValue) {
        setFixType(FIX43.FIX550_ENU_CROSS_PRIORITIZATION);
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
        Tag550EnuCrossPrioritization tagData;

        tagData = new Tag550EnuCrossPrioritization(TESTA_ENU_CROSS_PRIORITIZATION);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag550EnuCrossPrioritization(TESTB_ENU_CROSS_PRIORITIZATION);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum550CrossPrioritization oneEnum : Enum550CrossPrioritization.values()) {
            System.out.println( new Tag550EnuCrossPrioritization(oneEnum).toVerboseString() );
        }
    }
}
