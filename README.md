### ✅ `README.md`

```markdown
# 🐳 Simple Java Docker App

This is a basic Java application that demonstrates how to run a simple Java program inside a Docker container. The application displays a greeting, current date and time, system information, and execution time.

## 📂 Project Structure

simple-java-docker/
├── Dockerfile
├── README.md
└── src/
    └── Main.java

## 🚀 Features

- Prints a hello message with the current date and time  
- Displays system information (OS, architecture, user)  
- Measures execution time  
- Runs inside a lightweight Docker container using OpenJDK 17 and Alpine Linux  

```

## 🛠️ Prerequisites

- [Docker](https://www.docker.com/) installed on your system

## 🔧 How to Build and Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/sejalsubhash/simple-java-docker.git
cd simple-java-docker
````

### 2️⃣ Build the Docker Image

```bash
docker build -t java-app .
```

### 3️⃣ Run the Docker Container

```bash
docker run --rm java-app
```

## 🧪 Sample Output

```
👋 Hello, Docker World!
📅 Current Date & Time: 22-07-2025 20:30:45

🖥️ System Info:
   OS: Linux 5.15.0-1051-aws
   Architecture: amd64
   User: root

⏱️ Execution Time: 1002 ms
```

## 📄 Dockerfile

```Dockerfile
FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY src/Main.java /app/Main.java

RUN javac Main.java

CMD ["java", "Main"]
```

## 👤 Author

* **Sejal S. Pawar**
  GitHub: [@sejalsubhash](https://github.com/sejalsubhash)

## 📜 License

This project is open source and available under the [MIT License](LICENSE).



---

### ✅ Next Steps

1. Save this as `README.md` in your project root.
2. Run:

```bash
git add README.md
git commit -m "Add README file with project instructions"
git push

```

