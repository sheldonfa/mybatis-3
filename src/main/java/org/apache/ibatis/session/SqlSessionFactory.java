/**
 *    Copyright 2009-2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * Creates an {@link SqlSession} out of a connection or a DataSource
 * 
 * @author Clinton Begin
 */
public interface SqlSessionFactory {

  SqlSession openSession();

  /**
   * 设置事务是否自动提交
   */
  SqlSession openSession(boolean autoCommit);
  SqlSession openSession(Connection connection);

  /**
   * 隔离级别
   */
  SqlSession openSession(TransactionIsolationLevel level);

  /**
   * 执行器类型
   */
  SqlSession openSession(ExecutorType execType);
  SqlSession openSession(ExecutorType execType, boolean autoCommit);
  SqlSession openSession(ExecutorType execType, TransactionIsolationLevel level);
  SqlSession openSession(ExecutorType execType, Connection connection);

  /**
   * 该方法说明：可以通过SqlSessionFactory获取Configuration对象
   */
  Configuration getConfiguration();

}
