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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.enums.fix44.Enum865EventType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  865
 *  EventType
 *  int
 *  <p></p>
 *  Code to represent the type of event
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Put
 *  <p>    2 - Call
 *  <p>    3 - Tender
 *  <p>    4 - Sinking Fund Call
 *  <p>    5 - Activation
 *  <p></p>
 *  <p>    6 - Inactivation
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag865EnuEventType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum865EventType dataValue;

    public final static Enum865EventType TESTA_ENU_EVENT_TYPE
            = Enum865EventType.ACTIVATION;
    public final static Enum865EventType TESTB_ENU_EVENT_TYPE
            = Enum865EventType.SINKING_FUND_CALL;

    public Tag865EnuEventType(Enum865EventType dataValue) {
        setFixType(FIX44.FIX865_ENU_EVENT_TYPE);
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
        Tag865EnuEventType tagData;

        tagData = new Tag865EnuEventType(TESTA_ENU_EVENT_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag865EnuEventType(TESTB_ENU_EVENT_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum865EventType oneEnum : Enum865EventType.values()) {
            System.out.println( new Tag865EnuEventType(oneEnum).toVerboseString() );
        }
    }
}
