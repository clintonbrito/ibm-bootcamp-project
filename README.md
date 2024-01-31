# IBM Bootcamp Project

This web application is a Financial Transaction Manager developed from scratch. It allows users to record transactions, delete them, update transaction details, and retrieve a comprehensive list of all transactions. Consideration for implementing date filtering and categorized totals are potential features for future updates.

<br>

## 🧪 Technologies

This project was developed using:

  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
  ![Angular](https://img.shields.io/badge/angular-%23DD0031.svg?style=for-the-badge&logo=angular&logoColor=white)
  ![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)
  ![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
  ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
  ![ESLint](https://img.shields.io/badge/ESLint-4B3263?style=for-the-badge&logo=eslint&logoColor=white)

<br>

## 🚀 Getting started locally

<p style>Clone this repository to your local machine and access the cloned directory:</p>

<pre><code>git clone git@github.com:clintonbrito/ibm-bootcamp-project.git
cd ibm-bootcamp-project</code></pre>

<p>Run this command to create all the project's Docker containers and install the dependencies:</p>

<pre><code>npm run compose:up</code></pre>

<p>If you need to stop and remove the project's Docker containers, you can use the following command:</p>

<pre><code>npm run compose:down</code></pre>

Check the front-end docker logs using the command `docker logs -f app_frontend` which address is running the application and open your browser and access the application through the address below to view the interface locally, for example:

<pre><code>http://172.25.0.4:4200/</code></pre>

<br>

## 🎨 Development Patterns

### Commit Patterns

[![Conventional Commits](https://img.shields.io/badge/Conventional%20Commits-1.0.0-%23FE5196?logo=conventionalcommits&logoColor=white)](https://conventionalcommits.org)

This project adopts the commit convention known as [Conventional Commits](https://www.conventionalcommits.org/). This means that we follow a standardized format for our commit messages, making it easier to generate changelogs and adopt semantic versioning.

Example commit message format:

<pre><code>feat: add login functionality
fix: resolve issue with user registration
wip: connecting back-end to front-end</code></pre>

### Branch Patterns

The branches in this project follow a specific pattern to facilitate organization and understanding of ongoing development. Some of the common prefixes used include `feature/`, `bugfix/`, `docs/`:

Example branch name:

<pre><code>feature/docker-setup
bugfix/eslint-errors
docs/update-readme</code></pre>

## 📝 License
This project is licensed under the MIT License. See the <a target="_blank" rel="noopener" href="https://github.com/clintonbrito/recipes-app/blob/5c4b1a74ab43a352c393def783f06080b7256088/LICENSE">LICENSE</a> file for details.
