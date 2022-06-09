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

/**
 *  892
 *  TotNoAllocs
 *  int
 *  <p></p>
 *  Total number of NoAlloc entries across all messages.
 *  <p></p>
 *  Should be the sum of all NoAllocs in each message that has
 *  repeating NoAlloc entries related to the same AllocID or AllocReportID.
 *  <p></p>
 *  Used to support fragmentation.
 */
public class Tag892TotNoAllocs {
}
