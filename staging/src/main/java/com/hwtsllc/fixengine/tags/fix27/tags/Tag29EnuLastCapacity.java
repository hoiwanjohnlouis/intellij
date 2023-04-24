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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum29LastCapacity;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  29
 *  LastCapacity
 *  char
 *  <p></p>
 *  Broker capacity in order execution
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Agent
 *  <p>    2 - Cross as agent
 *  <p>    3 - Cross as principal
 *  <p>    4 - Principal
 */
public class Tag29EnuLastCapacity extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum29LastCapacity dataValue;

    public final static Enum29LastCapacity TESTA_ENU_LAST_CAPACITY
            = Enum29LastCapacity.AGENT;
    public final static Enum29LastCapacity TESTB_ENU_LAST_CAPACITY
            = Enum29LastCapacity.PRINCIPAL;

    public Tag29EnuLastCapacity(Enum29LastCapacity dataValue) {
        setFixType(FIX27.FIX29_ENU_LAST_CAPACITY);
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
        System.out.println( new Tag29EnuLastCapacity(TESTA_ENU_LAST_CAPACITY).toVerboseString() );
        System.out.println( new Tag29EnuLastCapacity(TESTB_ENU_LAST_CAPACITY).toVerboseString() );

        // loop around the ENUM and display
        for (Enum29LastCapacity oneEnum : Enum29LastCapacity.values()) {
            System.out.println( new Tag29EnuLastCapacity(oneEnum).toVerboseString() );
        }
    }
}
