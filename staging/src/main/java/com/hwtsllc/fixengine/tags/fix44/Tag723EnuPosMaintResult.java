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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.enums.fix44.Enum723PosMaintResult;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  723
 *  PosMaintResult
 *  int
 *  <p></p>
 *  Result of Position Maintenance Request.
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful Completion - no warnings or errors
 *  <p>    1 - Rejected
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag723EnuPosMaintResult extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum723PosMaintResult dataValue;

    public final static Enum723PosMaintResult TESTA_ENU_POS_MAINT_RESULT
            = Enum723PosMaintResult.OTHER;
    public final static Enum723PosMaintResult TESTB_ENU_POS_MAINT_STATUS
            = Enum723PosMaintResult.SUCCESSFUL;

    public Tag723EnuPosMaintResult(Enum723PosMaintResult dataValue) {
        setFixType(FIX44.FIX723_ENU_POS_MAINT_RESULT);
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
        Tag723EnuPosMaintResult tagData;

        tagData = new Tag723EnuPosMaintResult(TESTA_ENU_POS_MAINT_RESULT);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag723EnuPosMaintResult(TESTB_ENU_POS_MAINT_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum723PosMaintResult oneEnum : Enum723PosMaintResult.values()) {
            System.out.println( new Tag723EnuPosMaintResult(oneEnum).toVerboseString() );
        }
    }
}
