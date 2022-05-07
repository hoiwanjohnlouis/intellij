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
import com.hwtsllc.fixengine2022.fix44.enums.Enum903CollAsgnTransType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  903
 *  CollAsgnTransType
 *  int
 *  Collateral Assignment Transaction Type
 *  Valid values:
 *      0 - New
 *      1 - Replace
 *      2 - Cancel
 *      3 - Release
 *      4 - Reverse
 */
public class Tag903EnuCollAsgnTransType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum903CollAsgnTransType dataValue;

    public final static Enum903CollAsgnTransType TESTA_ENU_COLL_ASGN_TRANS_TYPE
            = Enum903CollAsgnTransType.CANCEL;
    public final static Enum903CollAsgnTransType TESTB_ENU_COLL_ASGN_TRANS_TYPE
            = Enum903CollAsgnTransType.NEW;

    public Tag903EnuCollAsgnTransType(Enum903CollAsgnTransType dataValue) {
        setFixType(FIX44.FIX903_ENU_COLL_ASGN_TRANS_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag903EnuCollAsgnTransType tagData;

        tagData = new Tag903EnuCollAsgnTransType(TESTA_ENU_COLL_ASGN_TRANS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag903EnuCollAsgnTransType(TESTB_ENU_COLL_ASGN_TRANS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
