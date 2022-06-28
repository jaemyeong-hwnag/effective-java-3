package com.example.effectivejava3.user;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class User{
    public enum UserGroup {
        ADMIN("관리자", Arrays.asList("ADMIN", "MANGER")),
        CUSTOMER("구매자", Arrays.asList("CUSTOMER", "CLIENT")),
        SHOP("판매자", Arrays.asList("SELLER", "SHOP", "TRADER")),
        NOTUSER("없는 사용자", Collections.EMPTY_LIST);

        private final String title;
        private final List<String> userGroupList;

        UserGroup(String title, List<String> userGroupList) {
            this.title = title;
            this.userGroupList = userGroupList;
        }

        public static UserGroup findByUserCode(String code){
            return
                    // UserGroup의 Enum 상수들을 순회하며
                    Arrays.stream(UserGroup.values())
                            // UserGroup를 갖고 있는게 있는지 확인합니다.
                            .filter(userGroup -> userGroup.hasPayCode(code))
                            .findAny()
                            .orElse(null);
        }

        /**
         * enum에 있는 값 여부 확인
         *
         * @param code enum코드
         * @return boolean
         */
        public boolean hasPayCode(String code){
            return userGroupList.stream()
                    .anyMatch(user -> user.equals(code));
        }

        public  String getTitle() {
            return this.title;
        }
    }
}
