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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumApplVerID;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1128 (same as 1128, 1030, 1137,)
 *  ApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied at message level.
 *  <p>
 *  Enumerated field with values assigned at time of service pack release
 *  <p></p>
 *  1130
 *  RefApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied to a message at the session level.
 *  <p>
 *  Enumerated field with values assigned at time of service pack release.
 *  <p>
 *  Uses same values as ApplVerID (1128)
 *  <p></p>
 *  1137
 *  DefaultApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied, by default, to message at the session level.
 *  <p>
 *  Enumerated field with values assigned at time of service pack release.
 *  <p>
 *  Uses same values as ApplVerID (1128)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - FIX27
 *  <p>    1 - FIX30
 *  <p>    2 - FIX40
 *  <p>    3 - FIX41
 *  <p>    4 - FIX42
 *
 *  <p>    5 - FIX43
 *  <p>    6 - FIX44
 *  <p>    7 - FIX50
 */
public class Tag1137EnuDefaultApplVerID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyEnumApplVerID dataValue;

    public final static MyEnumApplVerID TESTA_ENU_DEFAULT_APPL_VER_ID
            = MyEnumApplVerID.FIX41;
    public final static MyEnumApplVerID TESTB_ENU_DEFAULT_APPL_VER_ID
            = MyEnumApplVerID.FIX50;

    public Tag1137EnuDefaultApplVerID(MyEnumApplVerID dataValue) {
        setFixType(FIX50.FIX1137_ENU_DEFAULT_APPL_VER_ID);
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
        Tag1137EnuDefaultApplVerID tagData;

        tagData = new Tag1137EnuDefaultApplVerID(TESTA_ENU_DEFAULT_APPL_VER_ID);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1137EnuDefaultApplVerID(TESTB_ENU_DEFAULT_APPL_VER_ID);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
