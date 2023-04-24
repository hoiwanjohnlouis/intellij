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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.tags.fix44.enums.Enum871InstrAttribType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  871
 *  InstrAttribType
 *  int
 *  <p></p>
 *  Code to represent the type of instrument attribute
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Flat (securities pay interest on a current basis but are traded without interest)
 *  <p>    2 - Zero coupon
 *  <p>    3 - Interest bearing (for Euro commercial paper when not issued at discount)
 *  <p>    4 - No periodic payments
 *  <p>    5 - Variable rate
 *  <p></p>
 *  <p>    6 - Less fee for put
 *  <p>    7 - Stepped coupon
 *  <p>    8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
 *  <p>    9 - When [and if] issued
 *  <p>    10 - Original issue discount
 *  <p></p>
 *  <p>    11 - Callable, puttable
 *  <p>    12 - Escrowed to Maturity
 *  <p>    13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
 *  <p>    14 - Pre-refunded
 *  <p>    15 - In default
 *  <p></p>
 *  <p>    16 - Unrated
 *  <p>    17 - Taxable
 *  <p>    18 - Indexed
 *  <p>    19 - Subject To Alternative Minimum Tax
 *  <p>    20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
 *  <p></p>
 *  <p>    21 - Callable below maturity value
 *  <p>    22 - Callable without notice by mail to holder unless registered
 *  <p></p>
 *  <p>    99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag871EnuInstrAttribType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum871InstrAttribType dataValue;

    public final static Enum871InstrAttribType TESTA_ENU_INSTR_ATTRIB_TYPE
            = Enum871InstrAttribType.CALLABLE_PUTTABLE;
    public final static Enum871InstrAttribType TESTB_ENU_INSTR_ATTRIB_TYPE
            = Enum871InstrAttribType.STEPPED_COUPON;

    public Tag871EnuInstrAttribType(Enum871InstrAttribType dataValue) {
        setFixType(FIX44.FIX871_ENU_INSTR_ATTRIB_TYPE);
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
        Tag871EnuInstrAttribType tagData;

        tagData = new Tag871EnuInstrAttribType(TESTA_ENU_INSTR_ATTRIB_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag871EnuInstrAttribType(TESTB_ENU_INSTR_ATTRIB_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            System.out.println( new Tag871EnuInstrAttribType(oneEnum).toVerboseString() );
        }
    }
}
