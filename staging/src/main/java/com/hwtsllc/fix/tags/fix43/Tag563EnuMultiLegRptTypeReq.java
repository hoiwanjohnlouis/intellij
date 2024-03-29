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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.enums.fix43.Enum563MultiLegRptTypeReq;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  563
 *  MultiLegRptTypeReq
 *  int
 *  <p></p>
 *  Indicates the method of execution reporting requested by issuer of the order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Report by mulitleg security only (do not report legs)
 *  <p>    1 - Report by multileg security and by instrument legs belonging to the multileg security
 *  <p>    2 - Report by instrument legs belonging to the multileg security only
 *              (do not report status of multileg security)
 */
public class Tag563EnuMultiLegRptTypeReq extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum563MultiLegRptTypeReq dataValue;

    public final static Enum563MultiLegRptTypeReq TESTA_ENU_MULTI_LEG_RPT_TYPE_REQ
            = Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS;
    public final static Enum563MultiLegRptTypeReq TESTB_ENU_MULTI_LEG_RPT_TYPE_REQ
            = Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY;

    public Tag563EnuMultiLegRptTypeReq(Enum563MultiLegRptTypeReq dataValue) {
        setFixType(FIX43.FIX563_ENU_MULTI_LEG_RPT_TYPE_REQ);
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
        Tag563EnuMultiLegRptTypeReq tagData;

        tagData = new Tag563EnuMultiLegRptTypeReq(TESTA_ENU_MULTI_LEG_RPT_TYPE_REQ);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag563EnuMultiLegRptTypeReq(TESTB_ENU_MULTI_LEG_RPT_TYPE_REQ);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            System.out.println( new Tag563EnuMultiLegRptTypeReq(oneEnum).toVerboseString() );
        }
    }
}
