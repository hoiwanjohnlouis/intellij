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
import com.hwtsllc.fixengine2022.fix27.enums.Enum59TimeInForce;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  59
 *  TimeInForce
 *  char
 *  <p></p>
 *  Specifies how long the order remains in effect.
 *  <p></p>
 *  Absence of this field is interpreted as DAY.
 *  <p></p>
 *  NOTE not applicable to CIV Orders.
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Day (or session)
 *  <p>    1 - Good Till Cancel (GTC)
 *  <p>    2 - At the Opening (OPG)
 *  <p>    3 - Immediate Or Cancel (IOC)
 *  <p>    4 - Fill Or Kill (FOK)
 *  <p></p>
 *  <p>    5 - Good Till Crossing (GTX)
 *  <p>    6 - Good Till Date (GTD)
 *  <p>    7 - At the Close
 */
public class Tag59EnuTimeInForce extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum59TimeInForce dataValue;

    public final static Enum59TimeInForce TESTA_ENU_TIME_IN_FORCE
            = Enum59TimeInForce.DAY;
    public final static Enum59TimeInForce TESTB_ENU_TIME_IN_FORCE
            = Enum59TimeInForce.AT_THE_CLOSE;

    public Tag59EnuTimeInForce(Enum59TimeInForce dataValue) {
        setFixType(FIX27.FIX59_ENU_TIME_IN_FORCE);
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
        System.out.println( new Tag59EnuTimeInForce(TESTA_ENU_TIME_IN_FORCE).toVerboseString() );
        System.out.println( new Tag59EnuTimeInForce(TESTB_ENU_TIME_IN_FORCE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            System.out.println( new Tag59EnuTimeInForce(oneEnum).toVerboseString() );
        }
    }
}
