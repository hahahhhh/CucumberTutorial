package com.tutorial;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
/*todo
* 遇到问题：
* 1.在io.cucumber中无法找到junit包
* 2.Cannot resolve symbol Cucumber
* 3.Cannot resolve symbol CucumberOptions
*在StackOverflow上查找到相关问题
* 但无法解决，参考
* https://stackoverflow.com/questions/55927250/the-import-cucumber-api-junit-cannot-be-resolved
* Please remove cucumber-core, cucumber-jvm-deps, gherkin and Junit.
* They're transitive dependencies and will be provided by your dependencies and
* after that run mvn clean install and re-import your project in your IDE.
* (You can add below set of dependency)
* 无法解决
* */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
}
