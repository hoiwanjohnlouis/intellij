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
import com.hwtsllc.fixengine2022.fix44.enums.Enum854QtyType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  854
 *  QtyType
 *  int
 *  Type of quantity specified in a quantity field:
 *  Valid values:
 *      0 - Units (shares, par, currency)
 *      1 - Contracts (if used - must specify ContractMultiplier (tag 231))
 *      2 - Units of Measure per Time Unit (if used - must specify UnitofMeasure (tag 996) and TimeUnit (tag 997))
 */
public class Log854EnuQtyType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum854QtyType dataValue;

    public final static Enum854QtyType TESTA_ENU_QTY_TYPE
            = Enum854QtyType.CONTRACTS;
    public final static Enum854QtyType TESTB_ENU_QTY_TYPE
            = Enum854QtyType.UNITS;

    public Log854EnuQtyType(Enum854QtyType dataValue) {
        setFixType(FIX44.FIX854_ENU_QTY_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        Log854EnuQtyType tagData;

        tagData = new Log854EnuQtyType(TESTA_ENU_QTY_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log854EnuQtyType(TESTB_ENU_QTY_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
