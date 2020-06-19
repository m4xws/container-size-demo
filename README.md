# openliberty dockerfile size comparison

![sizeComparison](images/Screenshot%202020-06-19%20at%2008.47.27.png)

# Build

```bash
mvn clean package 
```

## Base

```bash
docker image build -t container-size-demo:openliberty -f Dockerfile .
```

## UBI

```bash
docker image build -t container-size-demo:ubi -f Dockerfile.ubi .
```

## Alpine

```bash
docker image build -t container-size-demo:alpine -f Dockerfile.fatjar.alpine .
```

## Distroless

```bash
docker image build -t container-size-demo:distroless -f Dockerfile.fatjar.distroless .
```
