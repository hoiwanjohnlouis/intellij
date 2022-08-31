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
import com.hwtsllc.fixengine2022.fix43.enums.Enum549CrossType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  549
 *  CrossType
 *  int
 *  <p></p>
 *  Type of cross being submitted to a market
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cross AON - cross tade which is executed complete or not.
 *  <p>         Both sides are treated in the same manner. This is equivalent to an "All or None".
 *  <p></p>
 *  <p>    2 - Cross IOC - cross trade which is executed partially and the rest is cancelled.
 *  <p>         One side is fully executed, the other side is partially executed with the remainder being cancelled.
 *  <p>         This is equivalent to an IOC on the other side.
 *  <p>         Note: CrossPrioritization (550) field may be used to
 *                    indicate which side should fully execute in this scenario.
 *  <p></p>
 *  <p>    3 - Cross One Side - cross trade which is partially executed with the unfilled portions remaining active.
 *  <p>         One side of the corss is fully executed (as denoted by the CrossPrioritization (550) field),
 *              but the unfilled portion remains active.
 *  <p></p>
 *  <p>    4 - Cross Same Price - cross trade is executed with existing orders with the same price.
 *  <p>         In this case other orders exist with the same price, the quantity of the Cross is
 *              executed against the existing orders and quotes, the remainder of the cross
 *              is executed against the other side of the cross.
 *  <p>         The two sides potentially have different quantities.
 */
public class Tag549EnuCrossType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum549CrossType dataValue;

    public final static Enum549CrossType TESTA_ENU_CROSS_TYPE
            = Enum549CrossType.CROSS_IOC;
    public final static Enum549CrossType TESTB_ENU_CROSS_TYPE
            = Enum549CrossType.CROSS_SAME_PRICE;

    public Tag549EnuCrossType(Enum549CrossType dataValue) {
        setFixType(FIX43.FIX549_ENU_CROSS_TYPE);
        this.dataValue = dataValue;
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
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
        Tag549EnuCrossType tagData;

        tagData = new Tag549EnuCrossType(TESTA_ENU_CROSS_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag549EnuCrossType(TESTB_ENU_CROSS_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum549CrossType oneEnum : Enum549CrossType.values()) {
            System.out.println( new Tag549EnuCrossType(oneEnum).toVerboseString() );
        }
    }
}
