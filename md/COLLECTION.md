#1. 发现github一个非常用的.md文件的编辑和使用的非常好用的东东     
    https://github.com/guodongxiaren/README.git
#2. 平时好纠结,用idea时,老是找不到Run Dashboard这东东,
    在项目中的.idear中找到workspace.xml文件
    找到<component name="RunDashboard">结点,代码如下,加入了入出来的部分就行
    
    <component name="RunDashboard">
        <!--加入的内容开始-->
        <option name="configurationTypes">
          <set>
            <option value="SpringBootApplicationConfigurationType" />
          </set>
        </option>
        <!--加入的内容结束-->
        <option name="ruleStates">
          <list>
            <RuleState>
              <option name="name" value="ConfigurationTypeDashboardGroupingRule" />
            </RuleState>
            <RuleState>
              <option name="name" value="StatusDashboardGroupingRule" />
            </RuleState>
          </list>
        </option>
      </component>
#3. 
