
### inspired from
[tutorial](https://medium.com/@javatechie/kubernetes-tutorial-run-deploy-spring-boot-application-in-k8s-cluster-using-yaml-configuration-3b079154d232)  

### build image and push it to personnal Dockerhub repository
```docker build --tag skeres95250/spring-api:v1.0 --file ./Dockerfile .
```
```docker image push skeres95250/spring-api:v1.0
```

### create deployment
```kubectl apply -f Deployment.yml
```
```kubectl get deployments.apps
```
```kubectl delete deployments.apps spring-boot-k8s
```

### create service
```kubectl get service
```
```kubectl apply -f Service.yml
```
```kubectl delete service springboot-k8s-svc
```

### get cluster IP adress
```kubectl get nodes -o wide
```

*Alternative on minikube o get local IP of minikube*      
```minikube ip
```

### test running application : curl or browser request clusterIP/service port
`curl http://192.168.49.2:31747`  
`curl http://192.168.49.2:31747/listeEtudiants`  






