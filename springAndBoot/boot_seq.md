# JPA를 사용한 Spring boot의 구조

게시글 리스트를 조회하는 시나리오로 시퀀스 다이어그램을 그리다가 정리의 필요성을 느끼고 적어본다.



### 1. 기본구조
---

![](./src/boot_seq_0.png)

- :file_folder:myJpaExampleProject

  - **MyJpaExampleProjectApplication.java**

- :file_folder:myJpaExampleProject/controller

  - **PostController.java**

- :file_folder:myJpaExampleProject/domain
  
  - **Post.java**

  - :file_folder:myJpaExampleProject/service

    - **PostService.java**
 
- :file_folder:myJpaExampleProject/store

   - **PostStore.java**

- :file_folder:myJpaExampleProject/repository

  - **PostRepository.java**

  - **PostJpo.java**

- :file_folder:myJpaExampleProject/runner

  - **DBRunner.java**