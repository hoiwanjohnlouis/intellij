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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.tags.fix42.enums.Enum388DiscretionInst;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  388
 *  DiscretionInst
 *  char
 *  <p>
 *  Code to identify the price a DiscretionOffsetValue (389) is related to and should be mathematically added to.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Related to displayed price
 *  <p>     1 - Related to market price
 *  <p>     2 - Related to primary price
 *  <p>     3 - Related to local primary price
 *  <p>     4 - Related to midpoint price
 *  <p></p>
 *  <p>     5 - Related to last trade price
 *  <p>     6 - Related to VWAP
 *  <p>     7 - Average Price Guarantee
 */
public class Tag388EnuDiscretionInst extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum388DiscretionInst dataValue;

    public final static Enum388DiscretionInst TESTA_ENU_DISCRETION_INST
            = Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE;
    public final static Enum388DiscretionInst TESTB_ENU_DISCRETION_INST
            = Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE;

    public Tag388EnuDiscretionInst(Enum388DiscretionInst dataValue) {
        setFixType(FIX42.FIX388_ENU_DISCRETION_INST);
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
        Tag388EnuDiscretionInst tagData;

        tagData = new Tag388EnuDiscretionInst(TESTA_ENU_DISCRETION_INST);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag388EnuDiscretionInst(TESTB_ENU_DISCRETION_INST);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            System.out.println( new Tag388EnuDiscretionInst(oneEnum).toVerboseString() );
        }
    }
}
