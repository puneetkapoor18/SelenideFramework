# SelenideFramework
Selenide Framework for Web

**Selenide + Junit5 + Allure for Web**

**Preferred Java Version : >=JDK-11**

**Libraries Used**:
1. [Selenide for web automation](https://github.com/selenide/selenide)
2. [Junit5 as testing framework](https://junit.org/junit5/)
3. [Allure for reporting](https://docs.qameta.io/allure/)
4. [Owner for properties file management](https://github.com/matteobaccan/owner)
5. [Lombok to avoid boilerplates](https://github.com/projectlombok/lombok)
6. [PODAM for test data generation](https://mtedone.github.io/podam/usage.html)

**To run web tests:**

```mvn clean test -Dgroups=web -Dselenide.browser=chrome```

```mvn clean test -Dgroups=web -Dselenide.browser=firefox```

```mvn clean test -Dgroups=regression -Dselenide.browser=chrome```

```mvn clean test -Dgroups=smoke -Dselenide.browser=chrome```


**To generate allure report after execution**

Install Allure in the machine - ```brew install allure```

Open allure reports - ```allure serve allure-results```