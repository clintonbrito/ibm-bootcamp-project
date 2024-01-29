FROM node:lts-alpine3.19 AS build

# Mudar para o diretório de trabalho /app-frontend
WORKDIR /app-frontend

# Copiar os package.json e package-lock.json para o container
COPY package*.json ./

# Instalar as dependências Node
RUN npm install

# Copiar o restante dos arquivos da aplicação para o container
COPY . .

# Sinalize que aplicação expõe a porta 4200
EXPOSE 4200

# Configurar os comandos para iniciar a aplicação de acordo com as boas práticas
ENTRYPOINT ["npm", "run"]
CMD ["start"]
