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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;

public class Tag67ListSeqNo extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_LIST_SEQ_NO = "567";  // same as tag34 TESTA_MSG_SEQ_NO
    public final static String TESTB_LIST_SEQ_NO = "1482";  // same as tag34 TESTB_MSG_SEQ_NO

    public Tag67ListSeqNo(String dataValue) {
        setFixType(FIXType.FIX67_LIST_SEQ_NO);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag67ListSeqNo tagData = new Tag67ListSeqNo(TESTA_LIST_SEQ_NO);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}