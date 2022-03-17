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
import com.hwtsllc.fixengine2022.datatypes.SeqNumType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;

public class Tag7BeginSeqNo extends TagTypeAbstract {
    private SeqNumType dataValue;

    public Tag7BeginSeqNo(final String dataValue) {
        setFixType(FIXType.FIX7_BEGIN_SEQ_NO);
        setDataValue(dataValue);
        // this.seqNum = (int) dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag7BeginSeqNo tagData = new Tag7BeginSeqNo("123456");
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
