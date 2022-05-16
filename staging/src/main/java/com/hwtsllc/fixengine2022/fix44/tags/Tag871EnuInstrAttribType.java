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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum871InstrAttribType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  871
 *  InstrAttribType
 *  int
 *  Code to represent the type of instrument attribute
 *  Valid values:
 *      1 - Flat (securities pay interest on a current basis but are traded without interest)
 *      2 - Zero coupon
 *      3 - Interest bearing (for Euro commercial paper when not issued at discount)
 *      4 - No periodic payments
 *      5 - Variable rate
 *      6 - Less fee for put
 *      7 - Stepped coupon
 *      8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
 *      9 - When [and if] issued
 *      10 - Original issue discount
 *      11 - Callable, puttable
 *      12 - Escrowed to Maturity
 *      13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
 *      14 - Pre-refunded
 *      15 - In default
 *      16 - Unrated
 *      17 - Taxable
 *      18 - Indexed
 *      19 - Subject To Alternative Minimum Tax
 *      20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
 *      21 - Callable below maturity value
 *      22 - Callable without notice by mail to holder unless registered
 *      99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
 *
 *      or any value conforming to the data type Reserved100Plus
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

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
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
        Tag871EnuInstrAttribType tagData;

        tagData = new Tag871EnuInstrAttribType(TESTA_ENU_INSTR_ATTRIB_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag871EnuInstrAttribType(TESTB_ENU_INSTR_ATTRIB_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
