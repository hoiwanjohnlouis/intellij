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
import com.hwtsllc.fixengine.tags.fix44.enums.Enum939TrdRptStatus;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  939
 *  TrdRptStatus
 *  int
 *  <p></p>
 *  Trade Report Status
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Rejected
 *  <p>    3 - Accepted with errors
 */
public class Tag939EnuTrdRptStatus extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum939TrdRptStatus dataValue;

    public final static Enum939TrdRptStatus TESTA_ENU_TRD_RPT_STATUS
            = Enum939TrdRptStatus.ACCEPTED;
    public final static Enum939TrdRptStatus TESTB_ENU_TRD_RPT_STATUS
            = Enum939TrdRptStatus.REJECTED;

    public Tag939EnuTrdRptStatus(Enum939TrdRptStatus dataValue) {
        setFixType(FIX44.FIX939_ENU_TRD_RPT_STATUS);
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
        Tag939EnuTrdRptStatus tagData;

        tagData = new Tag939EnuTrdRptStatus(TESTA_ENU_TRD_RPT_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag939EnuTrdRptStatus(TESTB_ENU_TRD_RPT_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum939TrdRptStatus oneEnum : Enum939TrdRptStatus.values()) {
            System.out.println( new Tag939EnuTrdRptStatus(oneEnum).toVerboseString() );
        }
    }
}
