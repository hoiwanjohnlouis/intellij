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
import com.hwtsllc.fixengine.tags.fix44.enums.Enum724PosReqType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  724
 *  PosReqType
 *  int
 *  <p></p>
 *  Used to specify the type of position request being made.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Positions
 *  <p>    1 - Trades
 *  <p>    2 - Exercises
 *  <p>    3 - Assignments
 *  <p>    4 - Settlement Activity
 *  <p></p>
 *  <p>    5 - Backout Message
 */
public class Tag724EnuPosReqType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum724PosReqType dataValue;

    public final static Enum724PosReqType TESTA_ENU_POS_REQ_TYPE
            = Enum724PosReqType.BACKOUT_MESSAGE;
    public final static Enum724PosReqType TESTB_ENU_POS_REQ_TYPE
            = Enum724PosReqType.SETTLEMENT_ACTIVITY;

    public Tag724EnuPosReqType(Enum724PosReqType dataValue) {
        setFixType(FIX44.FIX724_ENU_POS_REQ_TYPE);
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
        Tag724EnuPosReqType tagData;

        tagData = new Tag724EnuPosReqType(TESTA_ENU_POS_REQ_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag724EnuPosReqType(TESTB_ENU_POS_REQ_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum724PosReqType oneEnum : Enum724PosReqType.values()) {
            System.out.println( new Tag724EnuPosReqType(oneEnum).toVerboseString() );
        }
    }
}
