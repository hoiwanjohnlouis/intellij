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
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  59
 *  TimeInForce
 *  char
 *  Specifies how long the order remains in effect.
 *
 *  Absence of this field is interpreted as DAY.
 *
 *  NOTE not applicable to CIV Orders.
 *  (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      0 - Day (or session)
 *      1 - Good Till Cancel (GTC)
 *      2 - At the Opening (OPG)
 *      3 - Immediate Or Cancel (IOC)
 *      4 - Fill Or Kill (FOK)
 *      5 - Good Till Crossing (GTX)
 *      6 - Good Till Date (GTD)
 *      7 - At the Close
 */
public class Log59EnuTimeInForce extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final Enum59TimeInForce dataValue;

    public final static Enum59TimeInForce TESTA_ENU_TIME_IN_FORCE = Enum59TimeInForce.DAY; // fake data
    public final static Enum59TimeInForce TESTB_ENU_TIME_IN_FORCE = Enum59TimeInForce.AT_THE_CLOSE;

    public Log59EnuTimeInForce(Enum59TimeInForce dataValue) {
        setFixType(FIX27.FIX59_ENU_TIME_IN_FORCE);
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
        Log59EnuTimeInForce tagData;

        tagData = new Log59EnuTimeInForce(TESTA_ENU_TIME_IN_FORCE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log59EnuTimeInForce(TESTB_ENU_TIME_IN_FORCE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
