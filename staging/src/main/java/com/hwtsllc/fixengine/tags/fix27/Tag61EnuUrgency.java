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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.enums.fix27.Enum61Urgency;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  61
 *  Urgency
 *  char
 *  <p></p>
 *  Urgency flag
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Normal
 *  <p>    1 - Flash
 *  <p>    2 - Background
 */
public class Tag61EnuUrgency extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum61Urgency dataValue;

    public final static Enum61Urgency TESTA_ENU_URGENCY
            = Enum61Urgency.NORMAL;
    public final static Enum61Urgency TESTB_ENU_URGENCY
            = Enum61Urgency.BACKGROUND;

    public Tag61EnuUrgency(Enum61Urgency dataValue) {
        setFixType(FIX27.FIX61_ENU_URGENCY);
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
        System.out.println( new Tag61EnuUrgency(TESTA_ENU_URGENCY).toVerboseString() );
        System.out.println( new Tag61EnuUrgency(TESTB_ENU_URGENCY).toVerboseString() );

        // loop around the ENUM and display
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            System.out.println( new Tag61EnuUrgency(oneEnum).toVerboseString() );
        }
    }
}