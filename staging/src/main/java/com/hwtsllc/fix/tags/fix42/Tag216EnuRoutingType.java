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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.enums.fix42.Enum216RoutingType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  216
 *  RoutingType
 *  int
 *  <p></p>
 *  Indicates the type of RoutingID (217) specified.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Target Firm
 *  <p>    2 - Target List
 *  <p>    3 - Block Firm
 *  <p>    4 - Block List
 */
public class Tag216EnuRoutingType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum216RoutingType dataValue;

    public final static Enum216RoutingType TESTA_ENU_ROUTING_TYPE
            = Enum216RoutingType.TARGET_FIRM;
    public final static Enum216RoutingType TESTB_ENU_ROUTING_TYPE
            = Enum216RoutingType.BLOCK_LIST;

    public Tag216EnuRoutingType(Enum216RoutingType dataValue) {
        setFixType(FIX42.FIX216_ENU_ROUTING_TYPE);
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
        Tag216EnuRoutingType tagData;

        tagData = new Tag216EnuRoutingType(TESTA_ENU_ROUTING_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag216EnuRoutingType(TESTB_ENU_ROUTING_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            System.out.println( new Tag216EnuRoutingType(oneEnum).toVerboseString() );
        }
    }
}
